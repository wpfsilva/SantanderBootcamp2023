package edu.exercicios.smartTv;

public class SmartTv {
    private boolean ligada = false;
    private int canal = 1;
    private int volume = 25;

    public boolean getLigada() {
        return this.ligada;
    }

    public void mudarCanal(int canal)
    {
        if(this.ligada == true)
        {
            this.canal = canal;
            System.out.println("Canal alterado para: " + this.canal);
        }
        else
            System.out.println("TV Desligada");
    }

    public int getCanal() {
        if(this.ligada == true)
            return this.canal;
        else
            return -1;
    }

    public int getVolume() {
        if(this.ligada == true)
            return this.volume;
        else
            return -1;
    }

    public void maisVolume()
    {
        if(this.ligada == true)
            this.volume += 5;
        else
            System.out.println("TV Desligada");
    }

    public void menosVolume()
    {
        if(this.ligada == true)
            this.volume -= 5;
        else
            System.out.println("TV Desligada");    
    }

    public void proximoCanal()
    {
        if(this.ligada == true)
            this.canal++;
        else
            System.out.println("TV Desligada");
    }

    public void canalAnterior()
    {
        if(this.ligada == true)
            this.canal--;
        else
            System.out.println("TV Desligada");
    }

    public void power()
    {
        if (this.ligada == false)
        {
            this.ligada = true;
        }else
        {
            this.ligada = false;
        }
    }
}

