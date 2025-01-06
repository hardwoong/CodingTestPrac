#include <iostream>
#include <vector>

using namespace std;

int main() {
    int N;
    cin >> N;

    // 2차원 배열을 0으로 초기화
    vector<vector<int>> paper(100, vector<int>(100, 0));

    // 색종이 영역을 1로 표시
    for (int i = 0; i < N; i++) {
        int x, y;
        cin >> x >> y;

        for (int j = x; j < x + 10; j++) {
            for (int k = y; k < y + 10; k++) {
                paper[j][k] = 1;
            }
        }
    }

    // 영역의 넓이 계산
    int area = 0;
    for (int i = 0; i < 100; i++) {
        for (int j = 0; j < 100; j++) {
            area += paper[i][j];
        }
    }

    cout << area << endl;

    return 0;
}
