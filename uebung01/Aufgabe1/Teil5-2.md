# Lösung NR.1
echo "Klartext" | tr '[A-Za-z]' '[Q-ZA-PQ-ZA-P]'

# Lösung NR.2
echo "Klartext" | tr '[a-z]' '[A-Z]' | tr '[A-Z]' '[Q-ZA-P]'
