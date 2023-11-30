import Link from "next/link";
import {
  FaHome,
  FaProjectDiagram,
} from "react-icons/fa";

const links = [
  { label: "Dashboard", route: "/", icon: <FaHome /> },
  { label: "Projects", route: "/projects", icon: <FaProjectDiagram /> },
];

export function Navbar() {
  return (
    <nav className="bg-blue-500 p-6">
      <ul className="flex items-center">
        {links.map(({ label, route, icon }) => (
          <li key={route} className="mr-8">
            <Link href={route} passHref>
              <div className="flex items-center">
                {icon && <span className="mr-2">{icon}</span>}
                {label}
              </div>
            </Link>
          </li>
        ))}
      </ul>
    </nav>
  );
}
