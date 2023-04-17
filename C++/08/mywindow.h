#ifndef MYWINDOW_H
#define MYWINDOW_H

#include <QMainWindow>
#include <QLabel>
#include <QMenu>
#include <QMenuBar>

class MyWindow : public QMainWindow
{
    Q_OBJECT
public:
    explicit MyWindow(QWidget *parent = 0);
    ~MyWindow();
    void createMenus();

private:
    QLabel* someCentralWidget;

signals:

public slots:
};

#endif // MYWINDOW_H
