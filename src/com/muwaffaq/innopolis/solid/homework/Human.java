package com.muwaffaq.innopolis.solid.homework;

import java.util.List;

interface Languages {
    public String sayHello();
}

class Arabic implements Languages {

    @Override
    public String sayHello(){
        return "مرحبا";
    }
}

class English implements Languages {

    @Override
    public String sayHello(){
        return "Hello";
    }
}

class Japanese implements Languages {

    @Override
    public String sayHello(){
        return "こんにちは";
    }
}

class Hobby{
    List<String> hobbies;
}
class addH{
    int addHobby(Hobby hobby, String namehobby){
        hobby.hobbies.add(namehobby);
        return hobby.hobbies.size();
    }
}

class Money{
    double salary;
}
class Tax{
    void calculateTax(Money mymoney, int percentage) {
        mymoney.salary = mymoney.salary * percentage;
    }
}

class Name{
    String name;
    String nickname;
}
class CreateNickName{
    void creatNickName(Name name, String postFix) {
        name.nickname = name.name.concat(postFix);
    }
}
class Human implements Needs, doPray, doPlaySports, doGetMarried, doOwnCompany, doBecomeEmployee {

    public String sayHello(Languages languages) {
        return languages.sayHello();
    }

    @Override
    public void pray() {
    }

    @Override
    public void playSports() {

    }

    @Override
    public void getMarried() {

    }

    @Override
    public void ownCompany() {

    }

    @Override
    public void becomeEmployee() {

    }

    public static void main(String[] args) {
        Human human = new Human();
        human.sayHello(new Arabic());
    }

}
