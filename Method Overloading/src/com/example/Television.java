package com.example;

 class Television {
	void display() {
		System.out.println("Switching on the TV");
	}
	void display(int screenSize) {
		System.out.println("TV Screen size : "+screenSize);
	}
	void display(double cost) {
		System.out.println("TV cost"+ cost);
	}
	void display(int channelno,String channel) {
		System.out.println(channelno+" is the channel no for "+channel);
	}
	void display(String show, int showTime) {
		System.out.println(show+" will be broadcasted at "+ showTime);
	}

}
