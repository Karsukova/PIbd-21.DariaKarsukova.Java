package laba2;

import java.awt.Graphics;

public interface IFighter {
    void SetPosition(int x, int y, int width, int height);

    void MoveTransport(Direction direction);

    void Draw(Graphics g);
}
