abstract class MediaFile {
    private String fileName;

    public MediaFile(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return this.fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void getInfo() {
        System.out.printf("● 파일명: [%s]\n", this.fileName);
    }

    public abstract void play();
}

class AudioFile extends MediaFile {
    public AudioFile(String fileName) {
        super(fileName);
    }

    @Override
    public void play() {
        System.out.println("  오디오 파일을 재생합니다.");
    }
}

class VideoFile extends MediaFile {
    public VideoFile(String fileName) {
        super(fileName);
    }

    @Override
    public void play() {
        System.out.println("  비디오 파일을 재생합니다.");
    }

    public void showSubtitles() {
        System.out.println("● 자막: 영화 자막을 표시합니다.");
    }
}

class Imagefile extends MediaFile {
    public Imagefile(String fileName) {
        super(fileName);
    }

    @Override
    public void play() {
        System.out.println("  이미지 파일을 표시합니다.");
    }
}

public class Ex01 {
    public static void main(String[] args) {
        MediaFile[] file = new MediaFile[3];
        file[0] = new AudioFile("music.mp3");
        file[1] = new VideoFile("movie.mp4");
        file[2] = new Imagefile("picture.jpg");

        for(int i = 0; i < file.length; i++) {
            file[i].getInfo();
            file[i].play();
        }

        VideoFile v = (VideoFile) file[1];
        v.showSubtitles();
    }
}
