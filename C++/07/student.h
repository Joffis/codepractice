#ifndef STUDENT_H
#define STUDENT_H

#include <QObject>
#include <QWidget>
#include <person.h>

class Student : public Person
{
    Q_OBJECT

private:
    int sNumber;
public:
    Student(QObject* parent);
    ~Student();
    void setNumber(int number);
    int getNumber();
public slots:
    void complainToHannuKarpo();
};

#endif // STUDENT_H
