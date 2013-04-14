package com.software.project.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public abstract class Entity {

	public Vector2 position;
	protected float width;
	protected float height;
	public Rectangle bounds;
	
	public Entity(Vector2 position, float width, float height) {
		this.position = position;
		this.width = width;
		this.height = height;
		bounds = new Rectangle(position.x - 10, position.y, width - 10, height);
	}

	public Vector2 getPosition() {
		return position;
	}

	public void setPosition(Vector2 position) {
		this.position = position;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public Rectangle getBounds() {
		return bounds;
	}

	public void setBounds(Rectangle bounds) {
		this.bounds = bounds;
	}
	
}