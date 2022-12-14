package com.splitscale.fordastore.core.url.delete;

import java.io.IOException;

import com.splitscale.fordastore.core.repositories.UrlRepository;

public class DeleteUrlInteractor {
  UrlRepository repository;

  public DeleteUrlInteractor(UrlRepository repository) {
    this.repository = repository;
  }

  public void deleteUrlById(long id) throws IOException {
    repository.deleteByUrlId(id);
  }

}
