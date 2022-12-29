class luaspersegipanjang(object):
  
  def __init__(self, panjang: float, lebar: float):
    self.panjang = panjang
    self.lebar = lebar
    
  def area()-> float:
    return panjang*lebar
  
class persegipanjang(luaspersegipanjang):
  
  def draw(self) -> VisualRepresentation:
    return visual_representation(self)