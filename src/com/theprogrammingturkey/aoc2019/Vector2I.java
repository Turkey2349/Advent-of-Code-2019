package com.theprogrammingturkey.aoc2019;

public class Vector2I
{
	public int x;
	public int y;

	public Vector2I(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public Vector2I(Vector2I vec)
	{
		this.x = vec.x;
		this.y = vec.y;
	}

	public double distanceTo(Vector2I vec)
	{
		return Math.pow(vec.x - x, 2) + Math.pow(vec.y - y, 2);
	}

	@Override
	public String toString()
	{
		return "(" + x + "," + y + ")";
	}

	@Override
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Vector2I))
			return false;

		Vector2I vec = (Vector2I) obj;
		return vec.x == x && vec.y == y;
	}

	@Override
	public int hashCode()
	{
		return this.toString().hashCode();
	}
}