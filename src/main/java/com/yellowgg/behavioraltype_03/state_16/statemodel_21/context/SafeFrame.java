package com.yellowgg.behavioraltype_03.state_16.statemodel_21.context;

import com.yellowgg.behavioraltype_03.state_16.statemodel_21.state.DayState;
import com.yellowgg.behavioraltype_03.state_16.statemodel_21.state.State;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Description: 安全框架
 * @Author: yellowgg
 * @Date: Created in 2021/7/30 14:58
 */
public class SafeFrame extends Frame implements ActionListener, Context {
    /**
     * 显示当前时间
     */
    private TextField textClock = new TextField(60);
    /**
     * 显示警报中心的记录
     */
    private TextArea textScreen = new TextArea(10, 60);
    /**
     * 金库使用按钮
     */
    private JButton buttonUse = new JButton("使用金库");
    /**
     * 按下警铃按钮
     */
    private JButton buttonAlarm = new JButton("按下警铃");
    /**
     * 正常通话按钮
     */
    private JButton buttonPhone = new JButton("正常通话");
    /**
     * 结束按钮
     */
    private JButton buttonExit = new JButton("结束");
    /**
     * 当前的状态
     */
    private State state = DayState.getInstance();

    public SafeFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        //  配置textClock
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        // 配置textScreen
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);
        // 为界面添加按钮
        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        // 配置界面
        add(panel, BorderLayout.SOUTH);
        // 显示
        pack();
        show();
        // 设置监听器
        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    /**
     * 设置时间
     *
     * @param hour
     */
    @Override
    public void setClock(int hour) {
        String clockstring = "现在时间是";
        if (hour < 10) {
            clockstring += "0" + hour + ":00";
        } else {
            clockstring += hour + ":00";
        }
        System.out.println(clockstring);
        textClock.setText(clockstring);
        state.doClock(this, hour);
    }

    /**
     * 改变状态
     *
     * @param state
     */
    @Override
    public void changeState(State state) {
        System.out.println("从" + this.state + "状态变为了" + state + "状态。");
        this.state = state;
    }

    /**
     * 联系警报中心
     *
     * @param msg
     */
    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call! " + msg + "\n");
    }

    /**
     * 在警报中心留下记录
     *
     * @param msg
     */
    @Override
    public void recordLog(String msg) {
        textScreen.append("record ... " + msg + "\n");
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if (e.getSource() == buttonUse) {           // 金库使用按钮
            state.doUse(this);
        } else if (e.getSource() == buttonAlarm) {  // 按下警铃按钮
            state.doAlarm(this);
        } else if (e.getSource() == buttonPhone) {  // 正常通话按钮
            state.doPhone(this);
        } else if (e.getSource() == buttonExit) {   // 结束按钮
            System.exit(0);
        } else {
            System.out.println("?");
        }
    }
}
