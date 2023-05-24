package section01.test;

public class DongdaemunIngredient extends Ingredient {
      
      private int fishcake; //어묵 추가!!
      
      public DongdaemunIngredient() {
         super();
      }
      
      public DongdaemunIngredient(int fishcake) {
         super();
         
         this.fishcake = fishcake;
      }

      public int getFishcake() {
         return fishcake;
      }

      public void setFishcake(int fishcake) {
         this.fishcake = fishcake;
      }
      
      
      @Override
      public String toString() {
         
         return "재료 [ 물: " + getWater() + "ml, 떡: " + getRiceCake() + "g, 어묵: "+fishcake+", 소스: " + getSauce() + "g ]";
      }

   }