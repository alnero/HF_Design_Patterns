package MVC;

import javax.sound.midi.*;
import java.util.HashSet;

/**
 * Model responsible for the beat generation and its behaviour.
 */
public class BeatModel implements BeatModelInterface, MetaEventListener {
    Sequencer sequencer;
    Sequence sequence;
    Track track;
    HashSet<BPMObserver> bpmObservers = new HashSet<>();
    HashSet<BeatObserver> beatObservers = new HashSet<>();
    int bpm = 90;


    @Override
    public void initialize() {
        setUpMidi();
        buildTrackAndStart();
    }



    @Override
    public void on() {
        sequencer.setMicrosecondPosition(0);
        sequencer.start();
        setBpm(90);
    }

    @Override
    public void off() {
        setBpm(0);
        sequencer.stop();
    }

    @Override
    public void setBpm(int bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(getBpm());
        notifyBPMObservers();
    }

    @Override
    public int getBpm() {
        return bpm;
    }

    public void beatEvent(){
        notifyBeatObservers();
    }

    @Override
    public void registerObserver(BPMObserver observer) {
        this.bpmObservers.add(observer);
    }

    @Override
    public void removeObserver(BPMObserver observer) {
        this.bpmObservers.remove(observer);
    }

    public void notifyBPMObservers(){
        for(BPMObserver observer : this.bpmObservers){
            observer.updateBPM();
        }
    }

    @Override
    public void registerObserver(BeatObserver observer) {
        this.beatObservers.add(observer);
    }

    @Override
    public void removeObserver(BeatObserver observer) {
        this.beatObservers.remove(observer);
    }

    public void notifyBeatObservers(){
        for(BeatObserver observer : this.beatObservers){
            observer.updateBeat();
        }
    }

    @Override
    public void meta(MetaMessage metaMsg) {
        if(metaMsg.getType() == 47){
            beatEvent();
            sequencer.setMicrosecondPosition(0);
            sequencer.start();
            setBpm(getBpm());
        }
    }

    public void setUpMidi(){
        try{
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(getBpm());
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void buildTrackAndStart() {
        int[] trackList = {35, 0, 47, 0};
        sequence.deleteTrack(null);
        track = sequence.createTrack();
        makeTracks(trackList);
        track.add(makeEvent(192, 9, 1, 0, 4));
        try{
            sequencer.setSequence(sequence);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void makeTracks(int[] list) {
        for(int i = 0; i < list.length; i++){
            int key = list[i];
            if(key != 0){
                track.add(makeEvent(144, 9, key, 100, i));
                track.add(makeEvent(128, 9, key, 100, i+1));
            }
        }
    }

    private MidiEvent makeEvent(int command, int channel, int data1, int data2, int tick) {
        MidiEvent event = null;
        try{
            ShortMessage msg = new ShortMessage();
            msg.setMessage(command, channel, data1, data2);
            event = new MidiEvent(msg, tick);
        } catch (Exception e){
            e.printStackTrace();
        }
        return event;
    }


}
