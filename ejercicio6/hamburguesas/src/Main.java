public class Main {
    public static void main(String[] args) {
        Builder builder = new HamburguesaBuilder();
        Cocina cocina = Cocina.getInstance(builder);
        Hamburguesa hamburguesa1 = cocina.buildHamburguesa(TipoCarne.POLLO, true, true, false, false);
        builder.build();
        System.out.println(hamburguesa1);
        Hamburguesa hamburguesa2 = cocina.buildHamburguesa(TipoCarne.RES, false, true, true, true);
        builder.build();
        System.out.println(hamburguesa2);
        Hamburguesa hamburguesa3 = cocina.buildHamburguesa(TipoCarne.TOCINO, true, true, true, true);
        builder.build();
        System.out.println(hamburguesa3);

    }
}