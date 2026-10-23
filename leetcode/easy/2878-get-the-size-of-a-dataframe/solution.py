import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    row = players.shape[0]
    col = players.shape[1]
    return [row, col] 
    