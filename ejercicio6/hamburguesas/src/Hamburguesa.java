public class Hamburguesa {
    private TipoCarne tipoCarne;
    private boolean lechuga;
    private boolean tomate;
    private boolean cebolla;
    private boolean queso;

    public void setTipoCarne(TipoCarne tipoCarne){
        this.tipoCarne = tipoCarne;
    }
    public void setLechuga(boolean lechuga) {
        this.lechuga = lechuga;
    }
    public void setTomate(boolean tomate) {
        this.tomate = tomate;
    }
    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }
    public void setQueso(boolean queso) {
        this.queso = queso;
    }

    public String toString(){
        return "Hamurguesa: tipo de carne = " + tipoCarne + ", lechuga = " + lechuga + ", tomate = " + tomate + ", cebolla = " + cebolla + ", queso = " + queso;
    }
}
