package de.uniHamburg.informatik.continuousvoice.services.sound.recorders;

import java.io.File;

import de.uniHamburg.informatik.continuousvoice.constants.AudioConstants.Loudness;
import de.uniHamburg.informatik.continuousvoice.services.sound.IAmplitudeListener;
import de.uniHamburg.informatik.continuousvoice.services.sound.IAudioServiceStartStopListener;
import de.uniHamburg.informatik.continuousvoice.services.sound.IRecorder;
import de.uniHamburg.informatik.continuousvoice.services.speaker.ISpeakerChangeListener;
import de.uniHamburg.informatik.continuousvoice.services.speaker.Speaker;

public interface IAudioService extends IRecorder {
    
    public void initialize();

    public void shutdown();

    public void startRecording();

    public File stopRecording();

    public File splitRecording();

    public Loudness getCurrentSilenceState();

    public void addAmplitudeListener(IAmplitudeListener sl);

    public void removeAmplitudeListener(IAmplitudeListener sl);

    public boolean isRunning();

    public boolean isRecording();

    public void addStartStopListener(IAudioServiceStartStopListener l);
    
    public String getMimeType();

	public void addSpeakerChangeListener(
			ISpeakerChangeListener iSpeakerChangeListener);

	public Speaker getCurrentSpeaker();

}