import java.util.Random;

public class OBlockCactus extends OBlock {

   protected OBlockCactus(int var1, int var2) {
      super(var1, var2, OMaterial.w);
      this.a(true);
   }

   public void a(OWorld var1, int var2, int var3, int var4, Random var5) {
      if(var1.f(var2, var3 + 1, var4)) {
         int var6;
         for(var6 = 1; var1.a(var2, var3 - var6, var4) == this.bA; ++var6) {
            ;
         }

         if(var6 < 3) {
            int var7 = var1.c(var2, var3, var4);
            if(var7 == 15) {
               var1.e(var2, var3 + 1, var4, this.bA);
               var1.c(var2, var3, var4, 0);
            } else {
               var1.c(var2, var3, var4, var7 + 1);
            }
         }
      }

   }

   public OAxisAlignedBB e(OWorld var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return OAxisAlignedBB.b((double)((float)var2 + var5), (double)var3, (double)((float)var4 + var5), (double)((float)(var2 + 1) - var5), (double)((float)(var3 + 1) - var5), (double)((float)(var4 + 1) - var5));
   }

   public int a(int var1) {
      return var1 == 1?this.bz - 1:(var1 == 0?this.bz + 1:this.bz);
   }

   public boolean b() {
      return false;
   }

   public boolean a() {
      return false;
   }

   public boolean c(OWorld var1, int var2, int var3, int var4) {
      return !super.c(var1, var2, var3, var4)?false:this.f(var1, var2, var3, var4);
   }

   public void a(OWorld var1, int var2, int var3, int var4, int var5) {
      if(!this.f(var1, var2, var3, var4)) {
         this.g(var1, var2, var3, var4, var1.c(var2, var3, var4));
         var1.e(var2, var3, var4, 0);
      }

   }

   public boolean f(OWorld var1, int var2, int var3, int var4) {
      if(var1.d(var2 - 1, var3, var4).a()) {
         return false;
      } else if(var1.d(var2 + 1, var3, var4).a()) {
         return false;
      } else if(var1.d(var2, var3, var4 - 1).a()) {
         return false;
      } else if(var1.d(var2, var3, var4 + 1).a()) {
         return false;
      } else {
         int var5 = var1.a(var2, var3 - 1, var4);
         return var5 == OBlock.aW.bA || var5 == OBlock.F.bA;
      }
   }

   public void a(OWorld var1, int var2, int var3, int var4, OEntity var5) {
      var5.a(ODamageSource.g, 1);
   }
}
