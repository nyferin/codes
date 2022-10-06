def solution(src, dest):
	moves = [(1, -2), (2, -1), (2, 1), (1, 2), (-1, 2), (-2, 1), (-2, -1), (-1, -2)]
	if src == dest:
		return 0

	def check_knight(steps, cell_list):
		if dest in cell_list:
			return steps
		return check_knight(steps+1, get_knight(cell_list))

	def get_knight(cell_list):
		def c_to_num(x, y):
			return (x * 8) + y
		def valid(x, y):
			if x in range(8) and y in range(8):
				return True
			else:
				return False
		knight = []
		for cell in cell_list:
			x = cell % 8
			y = cell // 8
			for (j, k) in moves:
				cords = c_to_num(x+j, y+k)
				if valid(x+j, y+k) and cords not in knight:
					knight.append(cords)
		return knight

	return check_knight(1, get_knight([src]))