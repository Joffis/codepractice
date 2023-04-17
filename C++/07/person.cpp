#include "person.h"
#include <QtWidgets>

/*
 * Q: Was the person deleted as it should be?
 * A: Yes.
 */

Person::Person(QObject* parent) : QObject(parent) {
    qDebug() << "Person created";
}

Person::~Person(){
    qDebug() << "Person deleted";
}

void Person::setName(QString name){
    qDebug() << "Name changed to " << name;
    this->name = name;
}

QString Person::getName(){
    qDebug() << "Name " << name << " returned";
    return name;
}
