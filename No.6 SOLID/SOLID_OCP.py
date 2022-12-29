class User:

  def __init__(self, username: str, umur: int):
      self.username = username
      self.umur = umur

  def __repr__(self):
      return f"User: {self.username}, {self.umur} tahun"


class Gamer(User):

  def __init__(self, username: str, umur: int, favorite_game: Game):
      super().__init__(username, umur)
      self.favorite_game = favorite_game
      
  def __repr__(self):
    return f"User: {self.username}, {self.umur} tahun, favorite game: {self.favorite_game}"