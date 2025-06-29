package com.wantoper.GoF17_OBServer;

import java.util.ArrayList;
import java.util.List;

public class Computer {
   private int power = 0;
   List<Notifyer> notifyers = new ArrayList<>();

   public void addNotify(Notifyer notifyer){
      notifyers.add(notifyer);
   }

   public void setPower(int power) {
      this.power = power;
   }

   public int getPower() {
      return power;
   }

   public void charge(){
      for (;power<=100;power++){
         for (Notifyer notifyer : notifyers) {
            notifyer.notifyd(power);
         }
      }
   }
}
