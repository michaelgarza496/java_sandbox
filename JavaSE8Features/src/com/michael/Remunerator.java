package com.michael;

public interface Remunerator {
	double deductFoodFee();
	default String haveFun() {return "Yaay";}
}
