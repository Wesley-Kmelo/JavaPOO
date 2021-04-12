package aula14poo;
public class Video implements AcoesVideo{

    private String Tit;
    private int avalia, views, curtidas ;
    private boolean reproduzindo;

    //Metodo COnstrutor

    public Video(String Tit) {
        this.Tit = Tit;
        this.avalia = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
        
    }
    
    
    //Metodos especiais get e set
    public String getTit() {
        return Tit;
    }

    public void setTit(String Tit) {
        this.Tit = Tit;
    }

    public int getAvalia() {
        return avalia;
    }

    public void setAvalia(int avalia) {
        this.avalia = avalia;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    
    @Override
    public void play() {
        this.reproduzindo = true;
        this.views++;
                
    }

    @Override
    public void pause() {
        if (reproduzindo) {
            this.reproduzindo=false;
            System.out.println("Video em Pausa");
        } else {
            System.out.println("Precisa dar o play primeiro");
        }
        
    }

    @Override
    public void like() {
        this.curtidas++;
        
    }

    @Override
    public String toString() {
        return "Video{" + "Tit=" + Tit + ", avalia=" + avalia 
                + ", views=" + views + ", curtidas=" + curtidas 
                + ", reproduzindo=" + reproduzindo + '}';
    }
    
}
