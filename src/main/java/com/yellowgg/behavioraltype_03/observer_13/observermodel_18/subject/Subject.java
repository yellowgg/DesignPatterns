package com.yellowgg.behavioraltype_03.observer_13.observermodel_18.subject;

import com.yellowgg.behavioraltype_03.observer_13.observermodel_18.observer.Observer;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Description: 被观察者
 * @Author: yellowgg
 * @Date: Created in 2021/7/29 22:01
 */
public abstract class Subject {

    /**
     * 持有观察者，有变动就推送观察者
     */
    private Collection<Observer> observerList = new ArrayList<>();

    public void attachObserver(Observer observer) {
        observerList.add(observer);
    }

    public void detachObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
