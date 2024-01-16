package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Playlist;

public interface Playlistservice {

	public void addPlaylist(Playlist playlist);

	public List<Playlist> fetchAllPlaylists();

}