public class OBehaviorDefaultDispenseItem implements OIBehaviorDispenseItem {

    public OBehaviorDefaultDispenseItem() {}

    public final OItemStack a(OIBlockSource oiblocksource, OItemStack oitemstack) {
        OItemStack oitemstack1 = this.b(oiblocksource, oitemstack);

        this.a(oiblocksource);
        this.a(oiblocksource, OEnumFacing.a(oiblocksource.h()));
        return oitemstack1;
    }

    protected OItemStack b(OIBlockSource oiblocksource, OItemStack oitemstack) {
        if (!(Boolean) etc.getLoader().callHook(PluginLoader.Hook.DISPENSE, new Dispenser((OTileEntityDispenser) oiblocksource.j()), null)) {
            OEnumFacing oenumfacing = OEnumFacing.a(oiblocksource.h());
            OIPosition oiposition = OBlockDispenser.a(oiblocksource);
            OItemStack oitemstack1 = oitemstack.a(1);

            a(oiblocksource.k(), oitemstack1, 6, oenumfacing, oiposition);
        }
        return oitemstack;
    }

    public static void a(OWorld oworld, OItemStack oitemstack, int i, OEnumFacing oenumfacing, OIPosition oiposition) {
        double d0 = oiposition.a();
        double d1 = oiposition.b();
        double d2 = oiposition.c();
        OEntityItem oentityitem = new OEntityItem(oworld, d0, d1 - 0.3D, d2, oitemstack);
        double d3 = oworld.t.nextDouble() * 0.1D + 0.2D;

        oentityitem.w = (double) oenumfacing.c() * d3;
        oentityitem.x = 0.20000000298023224D;
        oentityitem.y = (double) oenumfacing.e() * d3;
        oentityitem.w += oworld.t.nextGaussian() * 0.007499999832361937D * (double) i;
        oentityitem.x += oworld.t.nextGaussian() * 0.007499999832361937D * (double) i;
        oentityitem.y += oworld.t.nextGaussian() * 0.007499999832361937D * (double) i;
        oworld.d((OEntity) oentityitem);
    }

    protected void a(OIBlockSource oiblocksource) {
        oiblocksource.k().f(1000, oiblocksource.d(), oiblocksource.e(), oiblocksource.f(), 0);
    }

    protected void a(OIBlockSource oiblocksource, OEnumFacing oenumfacing) {
        oiblocksource.k().f(2000, oiblocksource.d(), oiblocksource.e(), oiblocksource.f(), this.a(oenumfacing));
    }

    private int a(OEnumFacing oenumfacing) {
        return oenumfacing.c() + 1 + (oenumfacing.e() + 1) * 3;
    }
}
