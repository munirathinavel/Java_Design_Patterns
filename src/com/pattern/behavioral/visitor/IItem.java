package com.pattern.behavioral.visitor;

public interface IItem<T> {
	double accept(IVisitor visitor);
}
