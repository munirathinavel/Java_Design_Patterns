package com.pattern.behavioral.visitor;

public interface IVisitor {
   double visit(Book book);
   double visit(Fruit fruit);
}
