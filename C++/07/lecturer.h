#ifndef LECTURER_H
#define LECTURER_H

#include <QObject>
#include <QWidget>
#include <person.h>

class Lecturer : public Person
{
    Q_OBJECT
private:
    int lSalary;
public:
    Lecturer(QObject* parent);
    ~Lecturer();
    void setSalary(int number);
    int getSalary();
signals:
    void tooMuchSalary();
};

#endif // LECTURER_H
