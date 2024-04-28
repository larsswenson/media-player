// Define interface
interface MediaPlayer {
    void play(String mediaType, String title);
    void pause();
    void stop();
}

// Implement AudioPlayer class
class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String mediaType, String title) {
        System.out.println("Playing " + mediaType + ": " + title);
    }

    @Override
    public void pause() {
        System.out.println("Audio player paused");
    }

    @Override
    public void stop() {
        System.out.println("Audio player stopped");
    }
}

// Implement VideoPlayer class
class VideoPlayer implements MediaPlayer {
    @Override
    public void play(String mediaType, String title) {
        System.out.println("Playing " + mediaType + ": " + title);
    }

    @Override
    public void pause() {
        System.out.println("Video player paused");
    }

    @Override
    public void stop() {
        System.out.println("Video player stopped");
    }
}

// Implement StreamingPlayer class
class StreamingPlayer implements MediaPlayer {
    @Override
    public void play(String mediaType, String title) {
        System.out.println("Streaming " + mediaType + ": " + title);
    }

    @Override
    public void pause() {
        System.out.println("Streaming player paused");
    }

    @Override
    public void stop() {
        System.out.println("Streaming player stopped");
    }
}

// Main class & instances
public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();
        StreamingPlayer streamingPlayer = new StreamingPlayer();

// Tests
        audioPlayer.play("audio", "Rumble");
        audioPlayer.pause();
        audioPlayer.stop();

        videoPlayer.play("video", "Citizen Kane");
        videoPlayer.pause();
        videoPlayer.stop();

        streamingPlayer.play("video", "BBC Livestream");
        streamingPlayer.pause();
        streamingPlayer.stop();
    }
}
