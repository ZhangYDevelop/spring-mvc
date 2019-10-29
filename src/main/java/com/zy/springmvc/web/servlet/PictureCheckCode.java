package com.zy.springmvc.web.servlet;

/**
 * @Author zhangy
 * @Date 10:43 2019/10/24
 **/

import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Random;
import java.awt.*;
import java.awt.image.*;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.*;


@SuppressWarnings("serial")
public class PictureCheckCode extends HttpServlet {
    //产生随机的字体
    private Font getFont() {
        Random random = new Random();
        Font font[] = new Font[5];
        font[0] = new Font("Forte", Font.PLAIN, 24);
        font[1] = new Font("Antique Olive Compact", Font.PLAIN, 24);
		/*font[2] = new Font("Ravie", Font.PLAIN, 24);
		font[3] = new Font("Wide Latin", Font.PLAIN, 24);
		font[4] = new Font("Gill Sans Ultra Bold", Font.PLAIN, 24);*/
        return font[random.nextInt(2)];
    }

    public Color getRandColor(int s,int e){
        Random random=new Random ();
        if(s>255) s=255;
        if(e>255) e=255;
        int r,g,b;
        r=s+random.nextInt(e-s);	//随机生成RGB颜色中的r值
        g=s+random.nextInt(e-s);	//随机生成RGB颜色中的g值
        b=s+random.nextInt(e-s);	//随机生成RGB颜色中的b值
        return new Color(r,g,b);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // 设置响应头 Content-type类型
        resp.setContentType("image/jpeg");
        // 以下三句是用于设置页面不缓存
        resp.setHeader("Pragma", "No-cache");
        resp.setHeader("Cache-Control", "No-cache");
        resp.setDateHeader("Expires", 0);

        OutputStream os = resp.getOutputStream();
        int width = 83, height = 30;
        // 建立指定宽、高和BufferedImage对象
        BufferedImage image = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);

        Graphics g = image.getGraphics(); // 该画笔画在image上
        Color c = g.getColor(); // 保存当前画笔的颜色，用完画笔后要回复现场
        g.fillRect(0, 0, width, height);


        char[] ch = "abcdefghjkmnpqrstuvwxyz23456789".toCharArray(); // 随即产生的字符串 不包括 i l(小写L) o（小写O） 1（数字1）0(数字0)
        int length = ch.length; // 随即字符串的长度
        String sRand = ""; // 保存随即产生的字符串
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            // 设置字体
            g.setFont(getFont());
            // 随即生成0-9的数字
            String rand = new Character(ch[random.nextInt(length)]).toString();
            sRand += rand;
            // 设置随机颜色
            g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            g.drawString(rand, 20 * i + 6, 25);
        }
        //产生随即干扰点
        for (int i = 0; i < 20; i++) {
            int x1 = random.nextInt(width);
            int y1 = random.nextInt(height);
            g.drawOval(x1, y1, 2, 2);
        }
        g.setColor(c); // 将画笔的颜色再设置回去
        g.dispose();

        //将验证码记录到session
        req.getSession().setAttribute("randCheckCode", sRand);
        // 输出图像到页面
        ImageIO.write(image, "JPEG", os);

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doGet(req, resp);
    }

}
