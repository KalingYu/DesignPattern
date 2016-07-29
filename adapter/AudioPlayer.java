package adapter;

/**
 * Created by kaling on 16-7-29.
 */
public class AudioPlayer implements MediaPlayer {

    MediaPlayer mediaPlayer;

    @Override
    public void play(String audioType, String fileName) {

        //播放MP3 音乐文件的内置支持
        if ("mp3".equalsIgnoreCase(audioType)) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }

        //mediaAdapter 提供了其它文件格式的支持
        else if ("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)) {
            mediaPlayer = new MediaAdapter(audioType);
            mediaPlayer.play(audioType, fileName);
        }

        //其它类型的，不支持
        else {
            System.out.println("Invalid media." + audioType + " format not supported");
        }

    }
}
