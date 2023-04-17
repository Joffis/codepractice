#include "mainwindow.h"
#include "person.h"
#include "student.h"
#include "lecturer.h"
#include <QApplication>

int main(int argc, char *argv[])
{
    QApplication a(argc, argv);
    MainWindow w;
    w.show();


    Student* student = new Student(&a);
    student->setName("Jaska");
    student->setNumber(123456);

    Lecturer* lecturer = new Lecturer(&a);
    lecturer->setName("Jeppe");

    QObject::connect(lecturer,
                     SIGNAL(tooMuchSalary()),
                     student,
                     SLOT(complainToHannuKarpo()));

    lecturer->setSalary(5000);

    return a.exec();
}
