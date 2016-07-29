package adapter;

/**
 * Created by kaling on 16-7-29.
 */


/**
 * 个人感悟：适配器模式主要是解决不想增加实体类，而直接利用现成的类，组合而有一个新功能的类。
 * 解决方案是：在需要扩展功能的类里添加一个 Adapter 实例，而 Adapter 类通过使用其它功能类的实例扩展功能，又统一了接口给它所服务的需要扩展功能的类，以供调用扩展。
 *
 * 使用 AudioPlayer 来播放不同格式的文件。
 *
 * 适配器模式的逻辑是这样的：
 * - 接口 AdvancedMediaPlayer 包含了 playVlc() 和 playMp4() 方法，分别可以播放这样两种格式的文件。
 * - VlcPlayer 和 Mp4Player 分别实现了 Advanced 的 playVlc 和 playMp4 方法
 * - MediaAdapter 实现了 MediaPlayer 接口，并保留了 AdvancedMediaPlayer 的实例，这样就扩展了 MediaPlayer 的方法。并为后来的AudioPlayer 暴露了统一的接口
 * - 接口 MediaPlayer 中包含了 play() 方法，用来播放各种类型的文件。
 * - 接口 MediaPlayer 的实现类 AudioPlayer 实现了 play() 方法。 并保留有  MediaAdapter 的一个实例。
 *    实现 MediaPlayer 是为了完成 play 这个方法， 用 MediaAdapter 实例则是为了扩展 play() 的方法。
 */
public class Test {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudioPlayer();

        mediaPlayer.play("mp3", "beyond the horizon.mp3");
        mediaPlayer.play("mp4", "along.mp4");
        mediaPlayer.play("vlc", "far far away.vlc");
        mediaPlayer.play("avi", "mind me.avi");

    }
}
