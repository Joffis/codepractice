#include "mywindow.h"

MyWindow::MyWindow(QWidget *parent) : QMainWindow(parent)
{
    someCentralWidget = new QLabel("Test");
    setCentralWidget(someCentralWidget);
    createMenus();
}

MyWindow::~MyWindow()
{

}

void MyWindow::createMenus()
{
    QAction *quit = new QAction("&Exit", this);
    QAction *usePen = new QAction("&Use Pen", this);
    QAction *useEreaser = new QAction("&Use Ereaser", this);
    QAction *about = new QAction("&About", this);

    QMenu *file;
    QMenu *tools;
    QMenu *help;
    file = menuBar()->addMenu("&File");
    tools = menuBar()->addMenu("&Tools");
    help = menuBar()->addMenu("&Help");

    file->addAction(quit);
    tools->addAction(usePen);
    tools->addAction(useEreaser);
    help->addAction(about);
}
