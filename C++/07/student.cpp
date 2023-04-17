#include "student.h"

Student::Student(QObject* parent): Person(parent), sNumber(0)
{
    qDebug() << "Student created";
}

Student::~Student(){
    qDebug() << "Student deleted";
}

void Student::setNumber(int number){
    qDebug() << "Student number changed to " << number;
    this->sNumber = number;
}

int Student::getNumber(){
    qDebug() << "Number " << sNumber << " returned";
    return sNumber;
}

void Student::complainToHannuKarpo(){
    qDebug() << "Complain sent to Hannu Karpo";
}
