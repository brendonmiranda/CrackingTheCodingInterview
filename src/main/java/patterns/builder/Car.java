package patterns.builder;

public class Car {

    private String color;
    private Integer year;

    private Car(Builder builder) {
        this.color = builder.color;
        this.year = builder.year;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getColor() {
        return color;
    }

    public Integer getYear() {
        return year;
    }

    public static class Builder {

        private String color;
        private Integer year;

        private Builder() {

        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder year(Integer year) {
            this.year = year;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }
}
