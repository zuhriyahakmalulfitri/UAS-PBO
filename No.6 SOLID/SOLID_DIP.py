class Perangkat(ABC):
  power: boolean
    
  def __init__(self, initial_state: bool=False):
    self.power = initial_state
    
  def On(self):
    raise NotImplementedError
  
  def Off(self):
    raise NotImplementedError
    
class Switch:
  
  def __init__(self, device: Perangkat, pressed: bool=False):
    self.device = device
    self.tekan = tekan
    
  def beralih(self):
    self.tekan = not self.tekan # beralih
    if self.tekan:
      self.device.On()
    else:
      self.device.Off()  

class LightBulb(Perangkat):
  
  def On(self):
    self.power = True
    
  def Off(self):
    self.power = False
