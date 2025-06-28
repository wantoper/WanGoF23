package com.wantoper.GoF09_Facade;

public class Computed {
    private Audio audio = new Audio();
    private Display display = new Display();
    public void Startup(){
        audio.setAudio();
        audio.OpenAudio();
        display.Open();
        System.out.println("开机完成...");
    }
}
