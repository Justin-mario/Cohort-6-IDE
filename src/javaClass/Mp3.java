package javaClass;

public class Mp3 {
    private int volume;
    private int channel;
    private boolean isOn;
    private boolean isMute;

    public Mp3(boolean isOn, int volume, boolean isMute) {
        this.volume = volume;




            this.isOn = isOn;
        if (volume <= 0) {
            this.isMute = true;
            volume = 0;
        }
    }


        public void setVolume ( int volume){

        this.volume = volume;
    }

        public int getVolume () {
        return volume;
    }

        public int increaseVolume () {
        if (volume != 0)
            volume++;
        return volume;
    }

        public int decreaseVolume () {
        if (volume != 5 && volume != 0)
            volume--;
        return volume;
    }
        public void setOn ( boolean on){
        isOn = on;
    }

        public boolean isOn () {
        return isOn;
    }

        public void setChannel ( int channel){

        this.channel = channel;
    }

        public int getChannel () {
        channel = 1;
        return channel;
    }
        public int increaseChannel () {
        if (channel >= 1)
            channel++;
        return channel;
    }
        public int decreaseChannel () {
        if (channel != 0)
            channel--;
        return channel;

    }
        public boolean isMute () {
        return isMute;

    }


    }





