package com.mygdx.zeldajam;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.zeldajam.GameObjects.GameObject;
import com.mygdx.zeldajam.GameObjects.Player;
import com.mygdx.zeldajam.Services.InputService;
import com.mygdx.zeldajam.Services.PositionService;
import com.mygdx.zeldajam.Services.RenderService;
import com.mygdx.zeldajam.Services.Service;

import java.util.ArrayList;

public class ZeldaJam extends ApplicationAdapter {

	ArrayList<GameObject> allObjects;
	ArrayList<Service> allServices;

	@Override
	public void create () {
		allObjects = new ArrayList<GameObject>();
		allObjects.add(new Player());
		// Services
		allServices = new ArrayList<Service>();
		allServices.add(new RenderService());
		allServices.add(new PositionService());
		allServices.add(new InputService());
	}

	@Override
	public void render () {
		for (Service service : allServices )
			service.update(allObjects);
	}
}
