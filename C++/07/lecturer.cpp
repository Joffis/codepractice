#include "lecturer.h"

Lecturer::Lecturer(QObject* parent): Person(parent), lSalary(0)
{
    qDebug() << "Lecturer created";
}

Lecturer::~Lecturer(){
    qDebug() << "Lecturer deleted";
}

void Lecturer::setSalary(int number){
    qDebug() << "Lecturer salary changed to " << number;
    if(number >= 5000){
        emit tooMuchSalary();
    }
    this->lSalary = number;
}

int Lecturer::getSalary(){
    qDebug() << "Salary " << lSalary << " returned";
    return lSalary;
}
