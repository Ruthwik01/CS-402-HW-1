import matplotlib.pyplot as plt
import pandas as pd



df = pd.read_csv('cc1.txt', header=None, names=['Address'])

plt.hist(df['Address'], bins=20, color='green', edgecolor='black')

plt.ylabel('Frequency')

plt.xlabel('Address')

plt.title(' cc1 Histogram')

plt.savefig('cc1.png')

plt.show()
