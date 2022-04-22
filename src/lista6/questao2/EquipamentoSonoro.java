package lista6.questao2;

public class EquipamentoSonoro extends Equipamento {
    private short volume;
    private boolean stereo;

    public void mono(){
        stereo = false;
    }

    public void stereo(){
        stereo = true;
    }

    public short getVolume() {
        return volume;
    }

    public void setVolume(short volume) {
        if (volume >= 0 & volume <= 10){
            this.volume = volume;
        } else {
            System.out.println("Volume até 10 mermão, tá surdo é ?");
        }
    }

    @Override
    public boolean liga() {
        volume = 5;
        return super.liga();
    }

}
