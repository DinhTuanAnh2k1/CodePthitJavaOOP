/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhdongho;

/**
 *
 * @author Admin
 */
import java.awt.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
import java.applet.Applet;
import java.util.TimeZone;
import java.util.Timer;
public class Clock extends Applet{
    GregorianCalendar cal;
      Timer clockTimer = new Timer();
      TimeZone clockTimeZone = TimeZone.getDefault();

      public Clock() {
          clockTimer.schedule(new TickTimerTask(), 0, 1000);
      }

      @Override
      public void init() {}

      @Override
      public void paint(Graphics g) {
          g.setColor(Color.ORANGE);
          g.fillOval(40, 40, 220, 220);
          g.setColor(Color.WHITE);
          g.fillOval(50, 50, 200, 200);
          //g.setColor(Color.ORANGE);
          // g.fillOval(80, 80, 140, 140);
          //g.drawOval(45,45, 210, 210);
          double second = cal.get(Calendar.SECOND);
          double minute = cal.get(Calendar.MINUTE);
          double hours = cal.get(Calendar.HOUR);
          //double milis = cal.get(Calendar.MILLISECOND);
          //Vẽ mặt đồng hồ
          for (int i = 0; i < 60; i++) {
              int length = 90;
              double rad = (i * 6) * (Math.PI) / 180;
              if (i % 5 == 0) {
                  length = 82;
                  g.setColor(Color.RED);
              } else {
                  g.setColor(Color.GRAY);
              }
              int x = 150 + (int)(95 * Math.cos(rad - (Math.PI / 2)));
              int y = 150 + (int)(95 * Math.sin(rad - (Math.PI / 2)));
              int x1 = 150 + (int)(length * Math.cos(rad - (Math.PI / 2)));
              int y1 = 150 + (int)(length * Math.sin(rad - (Math.PI / 2)));
              g.drawLine(x, y, x1, y1);
          }
          //vẽ kim đồng hồ
          drawHands(g, second, minute, hours);
          //g.fillOval(50, 50, 200, 200);
          SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
          g.setColor(Color.BLACK);
          g.setFont(new Font("Tahoma", Font.BOLD, 16));
          g.drawString(sdf.format(cal.getTime()), 112, 290);
          g.setFont(new Font("Arial", Font.BOLD, 10));
          g.drawString("CODE BY TUAN ANH", 100, 145);
          g.drawString("12", 144, 80);
          g.drawString("6", 147, 230);
          g.drawString("3", 224, 154);
          g.drawString("9", 73, 154);
      }

      /***
        * 1 độ = pi/180 rad
        * -đường tròn 360 độ, kim giây phải nhích 60 lần suy ra 1 lần nhích số radian
        * bằng (số giây * 6) * pi/180 rad
        * -tương tự với số phút, nhưng khi kim giây nhích thì kim phút cũng phải nhích
        * theo nên ta công thêm số giây/60 vào để kim phút nhích, ví dụ 1 phút 30 giây
        *  thì bằng 1,5 phút
        * - đối với kim giờ thì quay 1 vòng tròn là 12 giờ, vậy mỗi giờ tăng 1 góc
        * là  số giờ x 30 (vì 12x30=360), và phải cộng thêm số phút để cho chính xác
        * lưu ý phải trừ ra pi/2 rad để đồng hồ quay đúng, vì đường tròn lượng giác
        * có chiều quay ngược kim đồng hồ tương ứng 9h=pi rad,12=pi/2 rad... nên phải trừ ra pi/2
        * @param g
        * @param second
        * @param minute
        * @param hours
        */
      public void drawHands(Graphics g, double second, double minute, double hours) {
          double rSecond = (second * 6) * (Math.PI) / 180;
          double rMinute = ((minute + (second / 60)) * 6) * (Math.PI) / 180;
          double rHours = ((hours + (minute / 60)) * 30) * (Math.PI) / 180;
          g.setColor(Color.RED);
          g.drawLine(150, 150, 150 + (int)(100 * Math.cos(rSecond - (Math.PI / 2))), 150 + (int)(100 * Math.sin(rSecond - (Math.PI / 2))));
          g.setColor(Color.BLACK);
          g.drawLine(150, 150, 150 + (int)(70 * Math.cos(rMinute - (Math.PI / 2))), 150 + (int)(70 * Math.sin((rMinute - (Math.PI / 2)))));
          g.drawLine(150, 150, 150 + (int)(50 * Math.cos(rHours - (Math.PI / 2))), 150 + (int)(50 * Math.sin(rHours - (Math.PI / 2))));
          //g.drawLine(150, 150, 150+(int)(100*Math.sin(2*Math.PI)),150+(int)(100*Math.cos(2*Math.PI)));
      }

      class TickTimerTask extends TimerTask {

          @Override
          public void run() {
              //throw new UnsupportedOperationException("Not supported yet.");
              cal = (GregorianCalendar) GregorianCalendar.getInstance(clockTimeZone);
              repaint();
          }
      }

}
