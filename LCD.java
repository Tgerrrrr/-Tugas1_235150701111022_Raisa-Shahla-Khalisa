package Encapsulasi;

public class LCD {
    private String status;
    private int volume;
    private int brightness;
    private int cc;
    private String cableType;

    public LCD() {
        this.status = "off";
        this.volume = 50;
        this.brightness = 50;
        this.cc = 1;
        setCable();
    }

    public void cableUp() {
        this.cc++;
        cek();
        setCable();
    }

    public void cableDown() {
        this.cc--;
        cek();
        setCable();
    }

    private void cek() {
        if (cc < 1) {
            cc = 3;
        } else if (cc > 3) {
            cc = 1;
        }
    }

    private void setCable() {
        switch (cc) {
            case 1:
                cableType = "HDMI";
                break;
            case 2:
                cableType = "DVI";
                break;
            case 3:
                cableType = "VGA";
                break;
            default:
                cableType = "DisplayPort";
                break;
        }
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void volumeUp() {
        if (volume < 100) {
            volume++;
        }
    }

    public void volumeDown() {
        if (volume > 0) {
            volume--;
        }
    }

    public void brightnessUp() {
        if (brightness < 100) {
            brightness++;
        }
    }

    public void brightnessDown() {
        if (brightness > 0) {
            brightness--;
        }
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public void Freeze() {
        this.status = "freeze";
    }

    public void displayMessage() {
        System.out.println("=================================================");
        System.out.println("Nama: Raisa Shahla Khalisa");
        System.out.println("NIM : 235150701111022");
        System.out.println("");
        System.out.println("Status: " + status);
        System.out.println("Volume: " + volume);
        System.out.println("Brightness: " + brightness);
        System.out.println("Cable: " + cableType);
        System.out.println("=================================================");
    }
}
