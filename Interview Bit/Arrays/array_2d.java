int len1, len2;
int **B = performOps(A, m, n, &len1, &len2);
int i, j;
for (i = 0; i < len1; i++) {
    for (j = 0; j < len2; j++) {
        printf("%d ", B[i][j]);
    }
}
