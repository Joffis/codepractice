#ifndef PERSON_H
#define PERSON_H

#include <QObject>
#include <QtWidgets>

class Person : public QObject
{
    Q_OBJECT

private:
QString name;

public:
    Person(QObject* parent);
    ~Person();
    void setName(QString name);
    QString getName();
};

#endif // PERSON_H
