package builder;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;

    public NutritionFacts(int servingSize, int servings){
        this(servingSize, servings, 0);
    }
    public NutritionFacts(int servingSize, int servings, int calories){
        this(servingSize, servings, calories, 0);
    }
    public NutritionFacts(int servingSize, int servings, int calories, int fat){
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
    }

    public static class Builder{
        // 필수 매개변수
        private final int servingSize;
        private final int servings;
        // 선택 매개변수 - 기본값으로 초기화한다.

        private int calories = 0;
        private int fat = 0;

        public Builder(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }
        public Builder calories(int val){
            calories = val;
            return this;
        }
        public Builder fat(int val){
            fat = val;
            return this;
        }
        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder){
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
    }

}
